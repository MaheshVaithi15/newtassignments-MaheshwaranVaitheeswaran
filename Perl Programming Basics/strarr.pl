# converting arrays into strings

@arr1 = qw/ 1 2 3 4 /;

$res = join(",",@arr1);

print("The String Formatted array: \n$res\n");


# for each in perl

print("For each iteration\n");

foreach $n(@arr1)
{

print("$n\n");
}

