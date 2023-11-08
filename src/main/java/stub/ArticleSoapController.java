
package stub;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ArticleSoapController", targetNamespace = "http://presentation.soap.formations.ma/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ArticleSoapController {


    /**
     * 
     * @return
     *     returns java.util.List<stub.Article>
     */
    @WebMethod
    @WebResult(name = "Article", targetNamespace = "")
    @RequestWrapper(localName = "getAll", targetNamespace = "http://presentation.soap.formations.ma/", className = "stub.GetAll")
    @ResponseWrapper(localName = "getAllResponse", targetNamespace = "http://presentation.soap.formations.ma/", className = "stub.GetAllResponse")
    @Action(input = "http://presentation.soap.formations.ma/ArticleSoapController/getAllRequest", output = "http://presentation.soap.formations.ma/ArticleSoapController/getAllResponse")
    public List<Article> getAll();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteById", targetNamespace = "http://presentation.soap.formations.ma/", className = "stub.DeleteById")
    @ResponseWrapper(localName = "deleteByIdResponse", targetNamespace = "http://presentation.soap.formations.ma/", className = "stub.DeleteByIdResponse")
    @Action(input = "http://presentation.soap.formations.ma/ArticleSoapController/deleteByIdRequest", output = "http://presentation.soap.formations.ma/ArticleSoapController/deleteByIdResponse")
    public String deleteById(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns stub.Article
     */
    @WebMethod
    @WebResult(name = "Article", targetNamespace = "")
    @RequestWrapper(localName = "getById", targetNamespace = "http://presentation.soap.formations.ma/", className = "stub.GetById")
    @ResponseWrapper(localName = "getByIdResponse", targetNamespace = "http://presentation.soap.formations.ma/", className = "stub.GetByIdResponse")
    @Action(input = "http://presentation.soap.formations.ma/ArticleSoapController/getByIdRequest", output = "http://presentation.soap.formations.ma/ArticleSoapController/getByIdResponse")
    public Article getById(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @param article
     * @return
     *     returns stub.Article
     */
    @WebMethod
    @WebResult(name = "Article", targetNamespace = "")
    @RequestWrapper(localName = "saveArticle", targetNamespace = "http://presentation.soap.formations.ma/", className = "stub.SaveArticle")
    @ResponseWrapper(localName = "saveArticleResponse", targetNamespace = "http://presentation.soap.formations.ma/", className = "stub.SaveArticleResponse")
    @Action(input = "http://presentation.soap.formations.ma/ArticleSoapController/saveArticleRequest", output = "http://presentation.soap.formations.ma/ArticleSoapController/saveArticleResponse")
    public Article saveArticle(
        @WebParam(name = "article", targetNamespace = "")
        Article article);

}
