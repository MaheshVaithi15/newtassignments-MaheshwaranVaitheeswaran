$fname = "text.txt";

open($fh , ">>",$fname);

print($fh "Ashi\n");
print($fh "Durga\n");

close($fh);
