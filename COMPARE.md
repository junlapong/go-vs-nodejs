# Compare HTTP Request of Java and Go

## Java (Spark & Jetty)

### Check

	5092335 spark-app-0.1.jar

	$ java -version
	openjdk version "1.8.0_212"
	OpenJDK Runtime Environment (AdoptOpenJDK)(build 1.8.0_212-b03)
	OpenJDK 64-Bit Server VM (AdoptOpenJDK)(build 25.212-b03, mixed mode)

### Run

	$ java -jar target/spark-app-0.1.jar

### Test Request

	$ http :9080/

	HTTP/1.1 200 OK
	Content-Type: text/html;charset=utf-8
	Date: Wed, 12 Jun 2019 04:52:38 GMT
	Server: Jetty(9.4.z-SNAPSHOT)
	Transfer-Encoding: chunked

	Hello Spark

### Perf Test

	$ wrk -c 100 -d 120s -t 4 http://localhost:9080/

	Running 2m test @ http://localhost:9080/
	4 threads and 100 connections
	Thread Stats   Avg      Stdev     Max   +/- Stdev
	  Latency     7.41ms    5.77ms 208.75ms   68.69%
	  Req/Sec     3.52k   521.80     7.36k    80.90%
	1680580 requests in 2.00m, 280.48MB read
	Socket errors: connect 0, read 9, write 0, timeout 0
	Requests/sec:  13994.08
	Transfer/sec:      2.34MB

## Go

### Check

	7429428 go-http

	$ go version
	go version go1.12.5 darwin/amd64

### Run

	$ ./go-http

### Test Request

	$ http :5000

	HTTP/1.1 200 OK
	Content-Length: 14
	Content-Type: text/plain; charset=utf-8
	Date: Tue, 11 Jun 2019 09:49:39 GMT
	X-Content-Type-Options: nosniff
	X-Request-Id: 1560246579904896000

	Hello, World!

### Perf Test

	$ wrk -c 100 -d 120s -t 4 http://localhost:5000/

	Running 2m test @ http://localhost:5000/
	4 threads and 100 connections
	Thread Stats   Avg      Stdev     Max   +/- Stdev
		Latency     5.67ms    6.81ms 237.24ms   98.50%
		Req/Sec     4.83k   812.86     6.97k    79.10%
	2308031 requests in 2.00m, 438.02MB read
	Requests/sec:  19227.84
	Transfer/sec:    3.65MB

## Tools
### 1. wrk

	brew install wrk

### 2. httpie

	brew install httpie

### 3. VisualVM

	brew cask install visualvm
