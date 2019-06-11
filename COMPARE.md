# Java vs Go

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
	Date: Tue, 11 Jun 2019 09:33:26 GMT
	Server: Jetty(9.4.z-SNAPSHOT)
	Transfer-Encoding: chunked

	<h1>Hello World!</h1>
	<h1>The above text is set using a FreeMarkerEngine</h1>

### Perf Test

	$ wrk -c 100 -d 120s -t 4 http://localhost:9080/

	Running 2m test @ http://localhost:9080/
	4 threads and 100 connections
	Thread Stats   Avg      Stdev     Max   +/- Stdev
		Latency     9.93ms    8.24ms 162.62ms   74.91%
		Req/Sec     2.82k     0.91k    5.63k    66.64%
	1344330 requests in 2.00m, 311.54MB read
	Socket errors: connect 0, read 7, write 2, timeout 0
	Requests/sec:  11195.93
	Transfer/sec:    2.59MB


## Go

### Check

	7429428 go-http

	$ go version

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
