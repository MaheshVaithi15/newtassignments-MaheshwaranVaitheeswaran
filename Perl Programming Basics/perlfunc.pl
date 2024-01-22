# creating subroutines with arguments

#default subroutine
sub greet(){
print("Hello !");
}

# arguments subroutine
sub name(){
	($fname,$lname) = @_;
	print("$fname $lname");
}

# parameter subroutine
sub add(){
foreach $val(@_){
print("$val, \n");
}
}

# using return keyword
sub example(){

foreach $name(@_){
if($name eq "Mahesh"){
return $name;
}
}
}

#using private access in scope of Subroutine
sub privatenum(){
my($d,$e) = @_;
print("d=$d,e=$e");
}




# calling the subroutine to perform the task

&privatenum(2,3);
print("The d and e : $d,$e");

#&greet();
#&name("Mahesh","Vaithi");
#&add(1,2,3,4);

#$ex = &example("Nijan","Pradeep","Mahesh");
#print($ex)

