#!/bin/bash
var1=ismail
var2=basha

echo $0 :: var1 : $var1,var2:$var2

export var1
./exportvariables1.sh

#lets see how they r now 
echo $0 :: var1 : $var1,var2:$var2

