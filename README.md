# Calculator_from_txt_file
Simple calculator which takes operations from txt files. It doesnt obey order of operations. Operations will be executed one after another.
Schema of operation looks like:


ADD 1
APPLY 1 

Then result is 2, as we apply 1 as the beginning number. Then to beginning number (which in this case is 1) program adds 1. 

ADD 1 
MULTIPLY 2
APPLY 1

Then result is 4, as we apply 1 as the beginning number. Then to beginning number (which in this case is 1) program adds 1. Then result of that add operation is multiplied by 2.
