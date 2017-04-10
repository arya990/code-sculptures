#!/bin/bash
#back up a single project directory

date='date +%F'
mkdir ~/Desktop/$1_$date
cp -R ~/Desktop/$1 ~/Desktop/$1_$date
echo backup of $1 is completed
 
