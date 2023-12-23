public class PalindromeNumber{
public static void main(String[] args){
   number = int(input("Введите число: "))
number_str = str(number)
is_palindrome = True
for i in range(len(number_str) // 2):
if number_str[i] != number_str[-i - 1]:
is_palindrome = False
break
if is_palindrome:
print("Число является палиндромом.")
else:
print("Число не является палиндромом.")
}
}
}
