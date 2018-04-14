package com.javajeff.nuvote;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.2.0.
 */
public class Voting extends Contract {
    private static final String BINARY = "6060604052341561000f57600080fd5b6040516102eb3803806102eb833981016040528080519091019050600181805161003d929160200190610044565b50506100ae565b828054828255906000526020600020908101928215610081579160200282015b828111156100815782518255602090920191600190910190610064565b5061008d929150610091565b5090565b6100ab91905b8082111561008d5760008155600101610097565b90565b61022e806100bd6000396000f30060606040526004361061006c5763ffffffff7c01000000000000000000000000000000000000000000000000000000006000350416632f265cf78114610071578063392e66781461009d5780637021939f146100c7578063b13c744b146100dd578063cc9ab26714610105575b600080fd5b341561007c57600080fd5b61008760043561011d565b60405160ff909116815260200160405180910390f35b34156100a857600080fd5b6100b3600435610149565b604051901515815260200160405180910390f35b34156100d257600080fd5b610087600435610196565b34156100e857600080fd5b6100f36004356101ab565b60405190815260200160405180910390f35b341561011057600080fd5b61011b6004356101ca565b005b600061012882610149565b151561013357600080fd5b5060009081526020819052604090205460ff1690565b6000805b60015481101561018b57600180548491908390811061016857fe5b60009182526020909120015414156101835760019150610190565b60010161014d565b600091505b50919050565b60006020819052908152604090205460ff1681565b60018054829081106101b957fe5b600091825260209091200154905081565b6101d381610149565b15156101de57600080fd5b6000908152602081905260409020805460ff8082166001011660ff199091161790555600a165627a7a72305820f8a3180d5fdc13dec08fd88a4e5f657cbef91a464779cbb0f5391013eebb1f3d0029";

    protected Voting(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Voting(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<BigInteger> totalVotesFor(byte[] candidate) {
        Function function = new Function("totalVotesFor", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(candidate)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<Boolean> validCandidate(byte[] candidate) {
        Function function = new Function("validCandidate", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(candidate)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<BigInteger> votesReceived(byte[] param0) {
        Function function = new Function("votesReceived", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteCall<byte[]> candidateList(BigInteger param0) {
        Function function = new Function("candidateList", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<TransactionReceipt> voteForCandidate(byte[] candidate) {
        Function function = new Function(
                "voteForCandidate", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(candidate)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public static RemoteCall<Voting> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, List<byte[]> candidateNames) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.Utils.typeMap(candidateNames, org.web3j.abi.datatypes.generated.Bytes32.class))));
        return deployRemoteCall(Voting.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static RemoteCall<Voting> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, List<byte[]> candidateNames) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.DynamicArray<org.web3j.abi.datatypes.generated.Bytes32>(
                        org.web3j.abi.Utils.typeMap(candidateNames, org.web3j.abi.datatypes.generated.Bytes32.class))));
        return deployRemoteCall(Voting.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static Voting load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Voting(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static Voting load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Voting(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }
}
