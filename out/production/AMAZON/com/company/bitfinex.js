let bitfinexObj = {
    height: 300,
    interval: '3h',
    locale: 'en',
    pair: 'BTC_USD',
    toolbar_bg: '',
    width: 360
}
const generateUrl =(bitfinexObj)=>{
    const baseUrl = new URL("http://testurl.bitfinex.com/");
    Object.keys(bitfinexObj).map(function(k){
        if(bitfinexObj[k]){
            baseUrl.searchParams.append(k,bitfinexObj[k]);
        }
//      
    })
    return baseUrl.href;
}
console.log(generateUrl(bitfinexObj));