run:
	go run main.go

build:
	go build -o go-http go-http.go

http:
	./go-http

wrk:
	wrk -c 1000 -d 10s -t 4 http://localhost:5000

