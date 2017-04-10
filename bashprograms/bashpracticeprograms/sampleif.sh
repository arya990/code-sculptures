#!/bin/bash

# backup a single project diorectory

if [$# != 1]
then
	echo Usage: A single argument which is the directory to backup
	exit
fi
	if [ ! -d ~/Desktop/$1 ]
	then
		echo 'the given directory does not exist'
		exit
	fi
	date='date +%F'

#do we already have a backup folder for todays date?

	if [ -d !/Desktop/$1_$date]
	then 		
		echo 'this prohect has already been backed up today, overwrite?'
	read  answer
	if [ $answer != 'y' ]
	then 
		exit
	fi
else
	mkdir ~/Desktop/$1_date
fi
cp -R ~/Desktop/$1 ~/Desktop/$1_$date
echo Backup of $1 completed
