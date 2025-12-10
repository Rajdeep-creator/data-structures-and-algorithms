class Solution {
    public boolean isAnagram(String s, String t) {
        
    char []a=s.toCharArray();

    char []b=t.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);


// if (a.toString().equals(b.toString())){


//         return true;
//      }else{

//       return   false;
//      }
    if(Arrays.equals(a,b))
        return true;
    return false;




    





        
    }
}