# coding: utf-8

"""
    Aces Service API

    API Specification for Aces Services for blockchain interoperability. 

    OpenAPI spec version: 0.1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import os
import sys
import unittest

import swagger_client
from swagger_client.rest import ApiException
from swagger_client.apis.default_api import DefaultApi


class TestDefaultApi(unittest.TestCase):
    """ DefaultApi unit test stubs """

    def setUp(self):
        self.api = swagger_client.apis.default_api.DefaultApi()

    def tearDown(self):
        pass

    def test_contracts_id_get(self):
        """
        Test case for contracts_id_get

        Get Service Contract.
        """
        pass

    def test_contracts_post(self):
        """
        Test case for contracts_post

        Create Service Contract
        """
        pass

    def test_info_get(self):
        """
        Test case for info_get

        Get Service Info.
        """
        pass

    def test_status_get(self):
        """
        Test case for status_get

        Get Health of node.
        """
        pass


if __name__ == '__main__':
    unittest.main()
