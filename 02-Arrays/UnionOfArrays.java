class UnionOfArrays {

    public int[] run(int[] nums1, int[] nums2) {
        int [] solution = new int[nums1.length + nums2.length]; 

        int firstArrayPointer = 0;
        int secondArrayPointer = 0;
        int numsInsertedIndex = 0;

        while (firstArrayPointer < nums1.length || secondArrayPointer < nums2.length) {
            int firstArrayCurrentElement =  Integer.MAX_VALUE;
            int secondArrayCurrentElement = Integer.MAX_VALUE;

            if (firstArrayPointer < nums1.length) {
                firstArrayCurrentElement = nums1[firstArrayPointer];
            }

            if (secondArrayPointer < nums2.length) {
                secondArrayCurrentElement = nums2[secondArrayPointer];
            }

            if (firstArrayCurrentElement < secondArrayCurrentElement) {
                if (numsInsertedIndex == 0 || firstArrayCurrentElement != solution[numsInsertedIndex - 1]) {
                    solution[numsInsertedIndex] = firstArrayCurrentElement;   
                    numsInsertedIndex+=1;
                }

                firstArrayPointer+=1;
            } else if (secondArrayCurrentElement < firstArrayCurrentElement) {
                if (numsInsertedIndex == 0 || secondArrayCurrentElement != solution[numsInsertedIndex - 1]) {
                    solution[numsInsertedIndex] = secondArrayCurrentElement;
                    numsInsertedIndex+=1;
                }
                secondArrayPointer +=1; 
            } else if (secondArrayCurrentElement == firstArrayCurrentElement) {
                if (numsInsertedIndex == 0 || secondArrayCurrentElement != solution[numsInsertedIndex - 1]) {
                    solution[numsInsertedIndex] = secondArrayCurrentElement;
                    numsInsertedIndex+=1;
                }
                firstArrayPointer+=1;
                secondArrayPointer+=1;
            }
        }

        return solution;
    }


    public static void main(String[] args) {
        UnionOfArrays solver = new UnionOfArrays();
        
        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};
        
        int[] result = solver.run(nums1, nums2);
        
        System.out.println("Union of arrays:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}