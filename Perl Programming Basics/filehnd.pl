#open(FILEHANDLER , "<","text.txt");
#while($r = <FILEHANDLER>)
#{
#print("$r");
#}
#close(FILEHANDLER);


open(FILEHANDLER , ">>","text.txt");
print(FILEHANDLER "Elangovan");
close(FILEHANDLER);
