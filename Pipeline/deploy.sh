#!/bin/sh

function deployFail {
    echo "Deploy to AWS Lambda failed"
}
trap deployFail ERROR

aws s3 cp ./Acuna-Library/target/Acuna-Library-1.0.0.jar s3://acuna-lambda
