#!/bin/sh

function packageFail {
    echo "Maven package failed"
}
trap packageFail ERROR

CURDIR=`pwd`
VERSION=$(cat ./version)
BUILD_VERSION=$VERSION.$BUILD_NUMBER

docker run --rm \
		   --env BUILD_NUMBER=$BUILD_NUMBER \
           -v "${CURDIR}/:/build" \
           --workdir /build/Acuna-Library \
           maven:3.5.2-jdk-8 echo "In container" && echo $BUILD_NUMBER
