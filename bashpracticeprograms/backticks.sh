#!/bin/bash

# sample documentation
# here in command line a file name should be given and tht file name cat is used and the number of lines in the cat are counted and stored in the variable lines 

lines='cat $1 | wc -l'

echo The number of lines in the file $1 is $lines

