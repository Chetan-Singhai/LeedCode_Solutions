class Solution {
    public boolean winnerOfGame(String colors) {
    //     boolean ans ;
    //     StringBuilder sb = new StringBuilder();
    //     for(int i= 0; i< colors.length(); i++){
    //         sb.append(colors.charAt(i));
    //     }
    //     int ac=0;
    //     int bc=0;
    //     for(int i=1; i < sb.length()-1; i++){
    //        char ch = sb.charAt(i);
    //      if(ch == 'A'){
    //       if(sb.charAt(i)==(sb.charAt(i-1)) && sb.charAt(i)==(sb.charAt(i+1))){
    //        //  sb.remove(i);
    //          ac = ac+1;
    //       }
    //     }else if(ch =='B'){
    //       if(sb.charAt(i)==(sb.charAt(i-1)) && sb.charAt(i)==(sb.charAt(i+1))){
    //         // sb.remove(i);
    //          bc = bc+1;
    //      }

    //     }
    // }
    // //     if (ac > bc){
    // //         return true;
    // //     }
    // // return false;
    //     }
    //     return ac > bc;


    //     int ac=0;
    //     int bc=0;
    //     for(int i=1; i < colors.length()-1; i++){
    //        char ch = colors.charAt(i);
    //        if(ch == 'A'){
    //          if(colors.charAt(i)==(colors.charAt(i-1)) && colors.charAt(i)==(colors.charAt(i+1))){
    //          ac = ac+1;
    //          }
    //        }else if(ch =='B'){
    //       if(colors.charAt(i)==(colors.charAt(i-1)) && colors.charAt(i)==(colors.charAt(i+1))){
    //          bc = bc+1;
    //      }

    //   }
    // }
    //     if (ac > bc){
    //         return true;
    //     }
    // return false;


        int ac=0;
        int bc=0;
        for(int i=1; i < colors.length()-1; i++){
         char ch = colors.charAt(i);
          if(colors.charAt(i)==(colors.charAt(i-1)) && colors.charAt(i)==(colors.charAt(i+1))){
             if (colors.charAt(i) == 'A') {
                    ac++;
                } else {
                    bc++;
                }
          }
        }  
        if (ac > bc){
            return true;
        }
    return false;
        

}
}