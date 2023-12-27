function palindrome(s) {
var res = true;
s = s.toString().toLowerCase().replace(/\s/g,'');
for(var i=0, j=parseInt(s.length/2), k=s.length-1; i<j; i++, k--) {
if(s.charAt(i) != s.charAt(k)) {
res = false;
break;
}       
}
return res;
}
alert('Число 123454321 ' + (palindrome(123454321) ? '' : ' не') + ' является палиндромом');
alert('Число 123456789 ' + (palindrome(123456789) ? '' : ' не') + ' является палиндромом');
alert('Строка "Аргентина манит негра" ' + (palindrome('Аргентина манит негра') ? '' : ' не') + ' является палиндромом');
alert('Строка "Аргентина ждет негра" ' + (palindrome('Аргентина ждет негра') ? '' : ' не') + ' является палиндромом');
