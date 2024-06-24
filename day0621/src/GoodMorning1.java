public class GoodMorning1 {

   static int[] num = {1, 2, 3, 4};
   static int R = 2;
   
   public static void main(String[] args) {
      
//      1. num에서 R개를 뽑아서 만들 수 있는 순열을 모두 출력하시오.
      System.out.println("----- 순열 -----");
      makePermutation( );
      
//      2. num에서 R개를 뽑아서 만들 수 있는 조합을 모두 출력하시오.
      System.out.println("----- 조합 -----");
      makeCombination( );
      
      
//      3. num으로 구성할 수 있는 모든 부분집합을 출력하시오.
      System.out.println("----- 부분집합 -----");
      makeSubset( );
      
   }
}