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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.AcesServiceApi);
  }
}(this, function(expect, AcesServiceApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new AcesServiceApi.Info();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('Info', function() {
    it('should create an instance of Info', function() {
      // uncomment below and update the code to test Info
      //var instane = new AcesServiceApi.Info();
      //expect(instance).to.be.a(AcesServiceApi.Info);
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instane = new AcesServiceApi.Info();
      //expect(instance).to.be();
    });

    it('should have the property description (base name: "description")', function() {
      // uncomment below and update the code to test the property description
      //var instane = new AcesServiceApi.Info();
      //expect(instance).to.be();
    });

    it('should have the property instructions (base name: "instructions")', function() {
      // uncomment below and update the code to test the property instructions
      //var instane = new AcesServiceApi.Info();
      //expect(instance).to.be();
    });

    it('should have the property capacities (base name: "capacities")', function() {
      // uncomment below and update the code to test the property capacities
      //var instane = new AcesServiceApi.Info();
      //expect(instance).to.be();
    });

    it('should have the property flatFee (base name: "flatFee")', function() {
      // uncomment below and update the code to test the property flatFee
      //var instane = new AcesServiceApi.Info();
      //expect(instance).to.be();
    });

    it('should have the property contractSchema (base name: "contractSchema")', function() {
      // uncomment below and update the code to test the property contractSchema
      //var instane = new AcesServiceApi.Info();
      //expect(instance).to.be();
    });

    it('should have the property features (base name: "features")', function() {
      // uncomment below and update the code to test the property features
      //var instane = new AcesServiceApi.Info();
      //expect(instance).to.be();
    });

  });

}));
