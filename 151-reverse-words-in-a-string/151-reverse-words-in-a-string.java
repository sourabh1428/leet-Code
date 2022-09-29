class Solution {
    public String reverseWords(String s) {
        StringBuilder s1=new StringBuilder();
        //blanks space hatao
        
       s=s.replaceAll("\\s+"," ").trim();
        
        //split krenge hrr words ko ek array type me
    
        String[] bro=s.split(" ");
        //append krdenege s1 array me jisko result me print krna hai
        
        for(int i=bro.length-1;i>=0;i--){
            s1.append(bro[i]+" ");
        }
        //last me trim isliye krre kyuki for loop me append me --> + " " ye hai jo ki end me ek blank space add krra
        
        return s1.toString().trim();
        
    }
}