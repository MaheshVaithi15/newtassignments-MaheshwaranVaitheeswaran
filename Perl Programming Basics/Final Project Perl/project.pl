# to get the list of names

sub build_list_of_names
{
@my_list=();
$filename = 'names.txt';
open(FILE,"<",$filename);
while(chomp($name = <FILE>))
{
push(@my_list,$name);
}
close(FILE);

}


# to create options menu

sub get_user_option
{
print("\n1. Search For Customer\n");
print("2. Add a new Customer\n");
print("3. Get all Customer\n");
print("4. Quit\n");

print("Enter the Option:");
chomp($option_selected = <STDIN>);

return $option_selected;

}

# to retrive all customers data
sub get_customers
{
print("Customers\n\n");
my $count = 0;
foreach $name_of_customers(@my_list)
{
$count+=1;
print("$count.$name_of_customers\n");
}
}


# add new customers

sub add_new_customer
{

print("\nEnter  the name of the Customer: ");
chomp($the_new_customer = <STDIN>);
$exit_status = push(@my_list,$the_new_customer);
if($exit_status)
{
print("\nNew Customer Added\n");
}
else
{
print("\nSomething went wrong\n");
}

}


#search for active customers

sub search_for_customer
{
print("Enter the name of the Customer to search: ");
chomp($name_of_customer=<STDIN>);

foreach $name(@my_list)
{
if(lc($name_of_customer) eq lc($name))
{
print("\nName was Found\n");
return;
}
}
}

# to start the pearl application

print("\n\n\t\tWelcome to Blue Star cafe\n\n");

&build_list_of_names();
$option_selected = &get_user_option();

while($option_selected !=4)
{

if($option_selected == 1)
{
&search_for_customer();
$option_selected = &get_user_option();
}
elsif($option_selected == 2)
{
&add_new_customer();
$option_selected = &get_user_option();
}
elsif($option_selected == 3)
{
&get_customers();
$option_selected = &get_user_option();
}
else
{
print("\n\nPlease Select Valid Option");
$option_selected = &get_user_option();
}

}


# to sava the customer details in the file

$filename = "names.txt";
open(FILE,">",$filename);
foreach $name(@my_list)
{
chomp($name);
print(FILE "$name\n");
}
close(FILE);
print("\n\nExiting......\n\n");
exit;








