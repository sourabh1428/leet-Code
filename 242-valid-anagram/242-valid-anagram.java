class Solution {
public boolean isAnagram(String s1, String s2) {
int a[]= new int [256];
for(int i=0;i<s1.length();i++){
a[s1.charAt(i)]++;
}
for(int i=0;i<s2.length();i++){
a[s2.charAt(i)]--;
}
for(int e:a){
if(e!=0) return false;
}
return true;
}
}