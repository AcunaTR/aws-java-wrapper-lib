#!/bin/sh

function packageFail {
    echo "Maven package failed"
}
trap packageFail ERROR

CURDIR=`pwd`
VERSION=$(cat ./version)
BUILD_VERSION=$VERSION.$BUILD_NUMBER

docker run --rm \
           -v "${CURDIR}/:/build" \
           --workdir /build/Acuna-Library \
           maven:3.5.2-jdk-8 mvn package
