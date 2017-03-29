#!/bin/bash
#Movie data excercise

#Find total number of Unique Users
var=$(cut -f1 ~/Desktop/Vote.txt | uniq | wc -l)
echo the number of unique users are $var

#Find total number of Unique Movies
echo the number of unique movies are $(cut -f2 ~/Desktop/Vote.txt | sort | uniq | wc -l)

#Find  10 Movies with Highest Rating
echo the 10 movies with highest rating are $(sort -k3 ~/Desktop/Vote.txt | cut -f2 | uniq | head)

#Find  10 Movies with Lowest Rating


echo the 10 movies with lowest rating are  $(sort -nk3 ~/Desktop/Vote.txt | cut -f2 |  uniq | head)

#Find 10 Users who watched most movies
echo Find 10 Users who watched more movies $(cut -f1 ~/Desktop/Vote.txt | sort -n | uniq -c | sort -rn | head)

#Find 10 Users who watched less movies
echo Find 10 Users who watched less movies $(cut -f1 ~/Desktop/Vote.txt | sort -n | uniq -c | sort -n | head)

