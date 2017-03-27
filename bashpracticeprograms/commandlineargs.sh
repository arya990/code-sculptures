#!/bin/bash
# sample documnetation

echo my name is $0 and i have been given $# command line arguments
echo here they are : $*
echo the second command line argument is $2


# $0 - The name of the script.
# $1 - $9 - Any command line arguments given to the script. $1 is the first argument, $2 the second and so on.
# $# - How many command line arguments were given to the script.
# $* - All of the command line arguments.

