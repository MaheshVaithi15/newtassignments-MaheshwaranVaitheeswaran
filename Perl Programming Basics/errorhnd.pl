# error handling in perl

# similar to try catch exception in others.

if(!open(LOG,"<my.txt"))
{
die("Error Occured: $!");
}
