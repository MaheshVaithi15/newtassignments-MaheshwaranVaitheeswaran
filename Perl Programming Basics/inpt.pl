# user input perl

# using chomp  function we can do the input 

print("Enter the Input: ");

chomp($inpt = <STDIN>);

while($inpt ne '0'){

print("Input Read from User:  $inpt\n");
chomp($inpt = <STDIN>);
}


