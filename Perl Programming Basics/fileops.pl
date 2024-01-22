$fname = "text.txt";

open($fh , "<",$fname);

while($r = <$fh>){

chomp($r);
print($r,"\n")

}
close($fh);
