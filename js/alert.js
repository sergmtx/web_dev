
var x = prompt('Вычислить сумму чисел до данного', 100);
function Sum (n)
{
    if (n == 1) return 1;
        return n + Sum(n-1);
} 
alert (x-1);
alert (Sum (x)); 








