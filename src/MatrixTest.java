import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    static final String matrix1 = " 2 2 1 2 3 4"  ;

    static final String matrix2 = " 2 3 1 2 3 4 5 6";




    @Test
    void testEquals() {

    }


    @Test
    void negate() {

    }



    // test to check if we are able to add null matrix to matrix
    @Test
    void addTest1() {
        Matrix M = new Matrix(new Scanner(matrix1));
        Matrix N = new Matrix(2,2);
        assertNull(M.add(M,N),"Null Not Found!! Expected Null");
    }

    // test to check for same matrices
    @Test
    void addTest2() {
        Matrix M = new Matrix(new Scanner(matrix1));
        Matrix N= new Matrix(2,2);
        assertNotEquals(M,N,"Operation Perferomed");

    }

    // method to check if the scalar multiplication is correct
    @Test
    void multiplyWithScalarTest1() {
        Matrix M = new Matrix(new Scanner(matrix1));
        Matrix result= M.multiplyWithScalar(2,M);
        assertEquals(2,result.getElem(1,1),"Values Mismatch");
    }

    /**
     * Method to check if the Height of matrix are changed during any Row Operations
     * BlackBox Testing
     * Assumed that the Matrix before and After should have the same height.
     */
    @Test
    void multiplyWithScalarTest2() {
        Matrix M = new Matrix(new Scanner(matrix1));
        Matrix result= M.multiplyWithScalar(2,M);
        assertEquals(M.getHeight(),result.getHeight(),"Unchanged Matrix Height");

    }
    /**
     * Method to Check if any Kind of Multiplication is Performed
     * BlackBox Testing
     * Assumed that Sent and Received Matrices should not be same.
     */
    @Test
    void multiplyWithScalarTest3() {
        Matrix M = new Matrix(new Scanner(matrix1));
        Matrix result=  new Matrix(2,2);
        result= M.multiplyWithScalar(2,result);
        assertNotEquals(result.getElem(1,1),M.getElem(1,1),"Values are Changed!!");

    }

    /**
     * Method to Check if the method returns null Matrix
     * BlackBox Testing
     * Assumed that operations cannot be performed on a Null Matrix
     */
    @Test
    void multiplyWithMatrixTest1() {
        Matrix M = new Matrix(2,2);
        assertNotNull(M.multiplyWithMatrix(M,M),"Null Matrix Found Sucessfully");

    }

    /**
     * Method to check if any Sort of row operations are performed
     * BlackBox Testing
     * Assumed that the Sent Matrix and Received matrices cannot be same.
     */
    @Test
    void multiplyWithMatrixTest2(){
        Matrix W=new Matrix(new Scanner(matrix2));
        Matrix result=  new Matrix(2,3);
        result=W.multiplyWithMatrix(W,result);
        assertNull(result,"");
    }

    /**
     * Method to check the Multiplication operation can be performed on a null Matrix
     * BlackBox Testing
     * Assumed that Multiplication cannot be performed with a Null Matrix
     */
    @Test
    void multiplyWithMatrixTest3(){
        Matrix W=new Matrix(new Matrix(0,0));
        Matrix M=new Matrix(new Scanner(matrix1));
        W.multiplyWithMatrix(W,M);
        assertNull(W.multiplyWithMatrix(W,M),"Multiplictaion With null Matrix Yields Null Matrix");

    }

    @Test
    void getElem() {
    }

    @Test
    void setElem() {

    }

    /**
     * Test getHeight() on a square matrix.
     * This is an example test.
     */
    @Test
    void getHeight_square() {
        Matrix M = new Matrix(new Scanner(matrix1));
        assertEquals(2, M.getHeight());
    }

    /**
     * Test getHeight() on a rectangular matrix.
     * This is an example test.
     */
    @Test
    void getHeight_wide() {
        Matrix M = new Matrix(new Scanner(matrix2));
        assertEquals(2, M.getHeight());
    }

    /**
     * Test getWidth() on a square matrix.
     * This is an example test.
     */
    @Test
    void getWidth_square() {
        Matrix M = new Matrix(new Scanner(matrix1));
        assertEquals(2, M.getHeight());
    }

    /**
     * Test getWidth()   on a rectangular matrix.
     * This is an example  test.
     */
    @Test
    void getWidth_wide() {
        Matrix M = new Matrix(new Scanner(matrix2));
        assertEquals(3, M.getWidth());
    }

}