
# match identifier
$_ = "Mahesh mAhesh MAheSh";

s/mahesh/vaithi/g;

print("$_");


# binding operator
$v1 = "Welcome to McodeIO";

if($v1 =~ /to/)
{
print("\nFound");
}
else
{
print("Not Found");
}



# match variables

$v2 = "Hello All,Have a Nice Day";

if(/(\S+) (\S+) (\S+)/)
{
print("$1 $2");
}

