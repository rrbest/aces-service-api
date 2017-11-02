/**
 * Aces Service API
 * API Specification for Aces Services for blockchain interoperability. 
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 */


import ApiClient from '../ApiClient';





/**
* The Result model module.
* @module model/Result
* @version 0.1.0
*/
export default class Result {
    /**
    * Constructs a new <code>Result</code>.
    * @alias module:model/Result
    * @class
    */

    constructor() {
        

        
        

        

        
    }

    /**
    * Constructs a <code>Result</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/Result} obj Optional instance to populate.
    * @return {module:model/Result} The populated <code>Result</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Result();

            
            
            

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], Object);
            }
        }
        return obj;
    }

    /**
    * Result property name.
    * @member {String} name
    */
    name = undefined;
    /**
    * Result value.
    * @member {Object} value
    */
    value = undefined;








}


