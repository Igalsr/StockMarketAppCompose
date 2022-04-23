package com.plcoding.stockmarketapp.data.csv

import java.io.InputStream

interface CSVStocksParser<T> {
    suspend fun parse(stream: InputStream) : List<T>
}