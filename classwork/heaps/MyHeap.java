public class MyHeap{
        private int[] heap;
        private int size;
        private int maxsize;
        private boolean isMaxHeap;

        public MyHeap(int numElements, boolean isMax) {
             maxsize = numElements;
             size = 0;
             heap = new int[maxsize];
             isMaxHeap = isMax;
          }

        private int parent(int pos) {
            // RETURN POSTION PARENT
            return 0;
        }

        private int leftChild(int pos) {
            // RETURN POSITION LEFTCHILD
            return 0 ;
        }
        
        private int rightChild(int pos) {
            // RETURN POSITION RIGHTCHILD
            return 0 ;
        }
        
        private void swap(int idx1, int idx2) {
                // YOUR CODE HERE
        }
        

        private void downHeapify(int pos) {
                // YOUR CODE HERE
        }
        
        private void heapifyUp(int pos) {
                // YOUR CODE HERE
        }

        public void insert(int element) {
                // YOUR CODE HERE

        }

        public void print() {
                // YOUR CODE HERE
        }

        public int deleteRoot() {
           // YOUR CODE HERE
            return 0;
        }

}
