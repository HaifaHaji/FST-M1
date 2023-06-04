name = input( "What's your name" )
age = int( input( "what's your age" ) )
year = str( ( 2023 - age ) + 100 )
print( name + " you will be 100 years old in " + year )

a = 1
while a < 5:
    print(a)
    a += 1
else:
    print("a is no longer less than 5")