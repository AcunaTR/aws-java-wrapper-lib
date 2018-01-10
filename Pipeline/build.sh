#!/bin/sh

function buildFail {
    echo "Maven build failed"
}
trap buildFail ERROR

CURDIR=`pwd`
VERSION=$(cat ./version)
BUILD_VERSION=$VERSION.$BUILD_NUMBER

docker run --rm \
		   --env BUILD_VERSION=$BUILD_VERSION \
           -v "${CURDIR}/:/build" \
           --workdir /build/Acuna-Library \
           maven:3.5.2-jdk-8 mvn compile