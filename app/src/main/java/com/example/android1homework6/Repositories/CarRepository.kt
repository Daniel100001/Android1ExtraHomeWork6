package com.example.android1homework6.Repositories

import com.example.android1homework6.data.CatModel

class CarRepository {
    private val catAddress: String = "https://http.cat/"
    private val catModelList = mutableListOf<CatModel>()

    fun getLisOfCat() : MutableList<CatModel>{
        catModelList.add(CatModel("${catAddress}100","100", "Continue", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}101", "101","Switching Protocols", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}102", "102","Processing", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}103","103", "Early Hints", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}200","200", "Ok", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}201","101", "Created", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}202","202", "Accepted", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}203", "203","Non-Authoritative", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}204", "204","No Content", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}206", "205","Partial Content", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}207", "206","Multi-Status", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}300", "300","Multiple Choices", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}301", "301","Moved Permanently", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}302", "100","Found", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}303", "100","See Other", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}304", "100","Not Modified", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}305","100", "Use Proxy", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}307","100", "Temporary Redirect", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}308","100", "Permanent Redirect", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}400","100", "Bad Request", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}401","100", "Unauthorized", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}402","100", "Payment Required", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}403","100", "Forbidden", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}404","100", "Not Found", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}405","100", "Method Not Allowed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}406","100", "Not Acceptable", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}407","100", "Proxy Authentication Required", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}408","100", "Request Timeout", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}409","100", "Conflict", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}410","100", "Gone", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}411","100", "Length Required", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}412","100", "Precondition Failed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}413","100", "Payload Too Large", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}414","100", "URI Too Long", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}415", "100","Unsupported Media", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}416","100", "Range Not Satisfiable", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}418","100", "I'm a teapot", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}421","100", "Misdirected Request", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}423","100", "ExpectationFailed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}424","100", "ExpectationFailed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}425","100", "ExpectationFailed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}426","100", "ExpectationFailed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}417","100", "ExpectationFailed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}417", "100","ExpectationFailed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}417", "100","ExpectationFailed", "Cам виноват"))
        catModelList.add(CatModel("${catAddress}417","100", "ExpectationFailed", "Cам виноват"))

        return catModelList

    }
}