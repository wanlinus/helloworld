.PHONY: clean docker

docker:
	mvn clean package -Dmaven.test.skip
	-docker rmi registry.cn-hangzhou.aliyuncs.com/wise2c-dev/build-biz:nuc-test
	docker build -t registry.cn-hangzhou.aliyuncs.com/wise2c-dev/build-biz:nuc-test .
	docker push registry.cn-hangzhou.aliyuncs.com/wise2c-dev/build-biz:nuc-test