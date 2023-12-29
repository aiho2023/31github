function palindrome(str) {
  str = str
    .toString()
    .toLowerCase()
    .replace(/\s|[,.!?"/-]/g, "");
  return str === str.split("").reverse().join("");
}

function superPalindrome(str) {
  const halfOfLength = Math.floor(str.length / 2);
  str = str.toLowerCase().replace(/\s|[,.!?"/-`':;]/g, "");
  for (let i = 0; i < halfOfLength; i++)
    if (str[i] !== str[str.length - i - 1]) {
      return false;
    }
  return true;
}
