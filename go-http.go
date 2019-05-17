package main

import (
    "fmt"
    "net/http"
)

func handler(w http.ResponseWriter, r *http.Request) {
    fmt.Fprintf(w, "Hello World")
}

func main() {
    port := "5000"
    fmt.Printf("Listening to traffic on port " + port + "\n")
    http.HandleFunc("/", handler)
    http.ListenAndServe(":" + port, nil)
}

