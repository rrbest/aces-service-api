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
import Capacity from './Capacity';
import Feature from './Feature';





/**
* The Info model module.
* @module model/Info
* @version 0.1.0
*/
export default class Info {
    /**
    * Constructs a new <code>Info</code>.
    * @alias module:model/Info
    * @class
    */

    constructor() {
        

        
        

        

        
    }

    /**
    * Constructs a <code>Info</code> from a plain JavaScript object, optionally creating a new instance.
    * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
    * @param {Object} data The plain JavaScript object bearing properties of interest.
    * @param {module:model/Info} obj Optional instance to populate.
    * @return {module:model/Info} The populated <code>Info</code> instance.
    */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Info();

            
            
            

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('instructions')) {
                obj['instructions'] = ApiClient.convertToType(data['instructions'], 'String');
            }
            if (data.hasOwnProperty('capacities')) {
                obj['capacities'] = ApiClient.convertToType(data['capacities'], [Capacity]);
            }
            if (data.hasOwnProperty('flatFee')) {
                obj['flatFee'] = ApiClient.convertToType(data['flatFee'], 'String');
            }
            if (data.hasOwnProperty('contractSchema')) {
                obj['contractSchema'] = ApiClient.convertToType(data['contractSchema'], Object);
            }
            if (data.hasOwnProperty('features')) {
                obj['features'] = ApiClient.convertToType(data['features'], [Feature]);
            }
        }
        return obj;
    }

    /**
    * Name of the contract service.
    * @member {String} name
    */
    name = undefined;
    /**
    * Description of the contract service.
    * @member {String} description
    */
    description = undefined;
    /**
    * Service usage instructions in markdown format.
    * @member {String} instructions
    */
    instructions = undefined;
    /**
    * @member {Array.<module:model/Capacity>} capacities
    */
    capacities = undefined;
    /**
    * @member {String} flatFee
    */
    flatFee = undefined;
    /**
    * Contract input schema in JSON Schema format.
    * @member {Object} contractSchema
    */
    contractSchema = undefined;
    /**
    * @member {Array.<module:model/Feature>} features
    */
    features = undefined;








}


