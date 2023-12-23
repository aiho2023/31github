public class PalindromeNumber{
public static void main(String[] args){
    function solution(str){
    let chars = new Set(str),
        wasOdd = false;

    for(let char of chars)
        if(str.match(new RegExp(char, 'gi')).length % 2)
            if(wasOdd)
                return false;
            else
                wasOdd = true;
    return true;
}
}
}
