package com.tambola;

public class Box{
   public void compare12() {
        Integer[] number_generator_arr = new Integer[90];
        for (int i = 1; i < number_generator_arr.length+1; i++) {
            number_generator_arr[i-1] = i;
        }
//       TambolaTickets t = new TambolaTickets();
//        t.ranTicket();
//        int count = 0;
//        Collections.shuffle(Arrays.asList(number_generator_arr));
//       for(int num : number_generator_arr){
//           System.out.print(num+", ");
//           count++;
//           if (count%10 == 0){
//               System.out.println();
//           }
//       }
    }

    public static void main(String[] args) {
        new Box().compare12();
    }
}
