$names = "Mahesh:Nijan:Pravin:Pradeep";

@arr = split(/:/,$names);

print("@arr\n");

print("After Split\n");
foreach $n(@arr){
print("$n\n");
}
