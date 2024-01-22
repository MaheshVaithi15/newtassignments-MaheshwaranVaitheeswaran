# matching list context
@names = qw/Mahesh mAhEsh MAhesH/;

@res = grep(/Mahesh/gi,@names);

print("Matched Exp: @res\n");



