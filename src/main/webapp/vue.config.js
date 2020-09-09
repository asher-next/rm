module.exports = {
    devServer: {
        host: '127.0.0.1',
        port: 8088,
        proxy: {
            '/api': {
                target: 'http://127.0.0.1:8080/',
                ws: true,
                changeOrigin: true,
                pathRewrite: {
                    '^/api': '/'  //通过pathRewrite重写地址，将前缀/api转为/
                }
            }
        }

    },
}
