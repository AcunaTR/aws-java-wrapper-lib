#!/bin/sh

function deployFail {
    echo "Deploy to AWS Lambda failed"
}
trap deployFail ERROR

CURDIR=`pwd`
VERSION=$(cat ./version)

docker run --rm \
           -v "${CURDIR}/:/build" \
           --workdir /build/Acuna-Library \
           maven:3.5.2-jdk-8 mvn deploy
