# create an hash

%names = ("n1" =>"Pravin","n2"=>"Pratap","n3"=>"Nijan");

# to assign hash

$names{"$n4"} = "Harris";

foreach $r (values(%names))
{

print("$r\n");

}


# to accessing hash elements
print($names{"$n2"});


# hash functions in perl


# printing keys and values

print("Keys\n");
foreach $k (keys(%names))
{
print("$k\n");
}
print("Values\n");
foreach $v (values(%names))
{
print("$v\n");
}

# to print key and values

while(($k,$v) = each(%names))
{
print("$k => $v\n");
}
